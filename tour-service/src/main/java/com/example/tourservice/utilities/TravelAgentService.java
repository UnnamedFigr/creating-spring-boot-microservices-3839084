package com.example.tourservice.utilities;

public class TravelAgentService {
    private  TourRepository tourRepository;

    public TravelAgentService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }
    public void display() {
        tourRepository.findAll().stream().forEach(System.out::println);
    }
}
