package com.airportmanagement.controller;

import com.airportmanagement.model.Booking;
import com.airportmanagement.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public String viewBookings(Model model) {
        List<Booking> bookings = bookingService.getAllBookings();
        model.addAttribute("bookings", bookings);
        return "bookings"; // Returns bookings.html template
    }

    @GetMapping("/new")
    public String showAddBookingForm(Model model) {
        model.addAttribute("booking", new Booking());
        return "add-booking"; // Returns add-booking.html template
    }

    @PostMapping("/add")
    public String addBooking(@ModelAttribute Booking booking) {
        bookingService.addBooking(booking);
        return "redirect:/bookings";
    }

    @GetMapping("/edit/{id}")
    public String showEditBookingForm(@PathVariable Long id, Model model) {
        Booking booking = bookingService.getBookingById(id);
        model.addAttribute("booking", booking);
        return "edit-booking"; // Returns edit-booking.html template
    }

    @PostMapping("/update/{id}")
    public String updateBooking(@PathVariable Long id, @ModelAttribute Booking booking) {
        bookingService.updateBooking(id, booking);
        return "redirect:/bookings";
    }

    @GetMapping("/delete/{id}")
    public String deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
        return "redirect:/bookings";
    }
}
