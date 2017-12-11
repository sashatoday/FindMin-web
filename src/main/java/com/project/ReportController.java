package com.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sasha on 11.12.17.
 */
@RestController
public class ReportController {

    @RequestMapping(value = "/reporting", method = RequestMethod.GET, produces = "plain/text")
    public String reporting(@RequestParam(value="data", defaultValue = "0") String array) {
        return FindMin.doit(array).toString();
    }
}
