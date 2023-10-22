package org.launchcode.techjobsmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;


public class TechJobsController {

    static HashMap<String, String> actionChoices = new HashMap<>();


    static HashMap<String, String> columnChoices = new HashMap<>();

    @ModelAttribute("actions")
    public static Map<String, String> getActionChoices() {

        return actionChoices;
    }
}
