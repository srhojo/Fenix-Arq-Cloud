package io.github.srhojo.fenix.ms.edgeone;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@Validated
@RestController
public class EdgeOneController {

    @GetMapping("/test/echo")
    public String test(@RequestParam("text") @NotBlank String text) {
        return text;
    }
}
