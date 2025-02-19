package com.example.webservices.services;

import com.example.webservices.models.Club;

public interface ClubServiceIntrefeace {
    public Club getClubById(Long id);
    public void addClub(Club club);
    public void updateClub(Club club);
    public void deleteClub(Long id);



}
