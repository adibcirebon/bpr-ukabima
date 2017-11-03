package id.co.ukabima.api.secured;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private/api")
public class IndexPrivateAPI {

    @GetMapping(
            value = "/data",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String rows() {
        return "{\n" +
                "  \"draw\": 1,\n" +
                "  \"recordsTotal\": 5,\n" +
                "  \"recordsFiltered\": 5,\n" +
                "  \"data\": [\n" +
                "    [1, \"Islam\", false ,1],\n" +
                "    [2, \"Kristen\", false ,2],\n" +
                "    [3, \"Protestan\", false ,3],\n" +
                "    [4, \"Hindu\", false ,4],\n" +
                "    [5, \"Budha\", false ,5]\n" +
                "  ]\n" +
                "}";
    }
}
