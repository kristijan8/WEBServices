package com.example.webservices.services;

import com.example.webservices.models.Club;
import com.example.webservices.repositories.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubService implements ClubServiceIntrefeace{

    @Autowired
    ClubRepository clubRepository;

    @Override
    public Club getClubById(Long id) {
        return clubRepository.findClubById(id);
    }

    @Override
    public void addClub(Club club) {
        //new club
        clubRepository.save(club);
    }

    @Override
    public void updateClub(Club club) {
        //update club
        clubRepository.save(club);
    }

    @Override
    public void deleteClub(Long id) {
        //delete club
        clubRepository.deleteById(id);
    }
}
