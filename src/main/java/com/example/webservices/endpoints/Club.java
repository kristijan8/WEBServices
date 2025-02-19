package com.example.webservices.endpoints;

import allapis.com.example.webservices.*;
import com.example.webservices.services.ClubService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class Club {

    private static final String NAMESPACE_URI = "http://com.example.webservices";

    @Autowired
    private ClubService clubService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getClubByIdRequest")
    @ResponsePayload
    public GetClubResponse getClub(@RequestPayload GetClubByIdRequest request) {
        GetClubResponse response = new GetClubResponse();
        ClubInfo clubInfo = new ClubInfo();
        BeanUtils.copyProperties(clubService.getClubById(request.getClubId()), clubInfo);
        response.setClubInfo(clubInfo);
        return response;
    }

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateClubRequest")
//    @ResponsePayload
//    public UpdateClubResponse updateClub(@RequestPayload UpdateClubRequest request) {
//        Club club = new Club();
//        BeanUtils.copyProperties(request.getClubInfo(), club);
//        clubService.updateClub(club);
//        ServiceStatus serviceStatus = new ServiceStatus();
//        serviceStatus.setStatus("SUCCESS");
//        serviceStatus.setMessage("Content Updated Successfully");
//        UpdateClubResponse response = new UpdateClubResponse();
//        response.setServiceStatus(serviceStatus);
//        return response;
//    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteClubRequest")
    @ResponsePayload
    public DeleteClubResponse deleteClub(@RequestPayload DeleteClubRequest request) {
        clubService.deleteClub(request.getClubId());
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Content Deleted Successfully");
        DeleteClubResponse response = new DeleteClubResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addClubRequest")
//    @ResponsePayload
//    public AddClubResponse addClub(@RequestPayload AddClubRequest request) {
//        Club club = new Club();
//        BeanUtils.copyProperties(request.getClubInfo(), club);
//        clubService.addClub(club);
//        ServiceStatus serviceStatus = new ServiceStatus();
//        serviceStatus.setStatus("SUCCESS");
//        serviceStatus.setMessage("Content Added Successfully");
//        AddClubResponse response = new AddClubResponse();
//        response.setServiceStatus(serviceStatus);
//        return response;
//    }








}
