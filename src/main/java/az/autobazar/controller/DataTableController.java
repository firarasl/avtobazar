package az.autobazar.controller;


import az.autobazar.domain.DataTableResult;
import az.autobazar.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class DataTableController {

    @Autowired
    AutoService autoService;


    @GetMapping("/getPendingAutos")
    DataTableResult getDataTable(@RequestParam int draw,
                                 @RequestParam int start,
                                 @RequestParam int length) {

        return  autoService.getDataTable(draw,start,length);
    }


    @GetMapping("/getApprovedAutos")
    DataTableResult getDataApprovedTable(@RequestParam int draw,
                                 @RequestParam int start,
                                 @RequestParam int length) {

        return  autoService.getDataTableApproved(draw,start,length);
    }

    @GetMapping("/getAllUsers")
    DataTableResult getDataTableUsers(@RequestParam int draw,
                                 @RequestParam int start,
                                 @RequestParam int length) {

        return  autoService.getDataUsers(draw,start,length);
    }








}
