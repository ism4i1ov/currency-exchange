package az.company.currencyexchange.service;

import az.company.currencyexchange.dto.ObjectFactory;
import az.company.currencyexchange.dto.ValCurs;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.StringReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Service
public class CurrencyService {

    private final RestTemplate restTemplate;
    private final Environment environment;

    public CurrencyService(RestTemplate restTemplate, Environment environment) {
        this.restTemplate = restTemplate;
        this.environment = environment;
    }

    public ValCurs getCurrencyFromAndTo() throws JAXBException {
        String url = String.format(Objects.requireNonNull(environment.getProperty("cbar.valute")), LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        System.err.println(url);
        String body = restTemplate.exchange(url,
                HttpMethod.GET, null, String.class).getBody();
        JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
        return (ValCurs) jaxbContext.createUnmarshaller().unmarshal(new StringReader(body));
    }
}
