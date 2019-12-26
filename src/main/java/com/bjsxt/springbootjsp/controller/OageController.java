package com.bjsxt.springbootjsp.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author hanyueqian
 * @date 2019/12/21 0021-下午 21:34
 */
@Controller
public class OageController
{

    @GetMapping("/{path}")
    public String showPage(@PathVariable String path)
    {
        return path;
    }
}
