package com.nlab.springmvctest

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class TestController {

    @RequestMapping("/")
    fun index(model: Model): String {
        model.addAttribute("test", "1234")

        return "index"
    }

    @RequestMapping(
        value = ["/json"],
        produces = ["application/json"]
    )
    @ResponseBody
    fun json(): Any = mapOf("test" to "1234")
}