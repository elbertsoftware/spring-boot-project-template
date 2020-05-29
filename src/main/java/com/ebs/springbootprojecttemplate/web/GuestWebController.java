package com.ebs.springbootprojecttemplate.web;

import com.ebs.springbootprojecttemplate.business.service.ReservationService;
import com.ebs.springbootprojecttemplate.data.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guests")
public class GuestWebController {

    // service should be final since after it is initialized, it should not be changed
    private final ReservationService reservationService;

    @Autowired
    public GuestWebController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getGuests(Model model) {
        List<Guest> guests = this.reservationService.getHotelGuests();
        model.addAttribute("guests", guests);

        return "guests";
    }

}