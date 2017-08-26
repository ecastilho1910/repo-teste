package edu.fcv.teste.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Version")
public class VersionController
{
    @RequestMapping(method = RequestMethod.GET)
    public String GetVersion()
    {
        return "Teste 1.0";
    }
}
