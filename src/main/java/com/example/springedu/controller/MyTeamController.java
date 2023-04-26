package com.example.springedu.controller;

import com.example.springedu.domain.TeamDTO;
import com.example.springedu.domain.TeamMemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class MyTeamController {

    @RequestMapping(value = "/body/json/{teamName}", produces = "application/json; charset=utf-8")  // text/json
    @ResponseBody
    public TeamDTO getByIdInJSON(){

        TeamMemberVO team1 = new TeamMemberVO("김철진","찰스","라면");
        TeamMemberVO team2 = new TeamMemberVO("구인영","잠만보","떡볶이");
        TeamMemberVO team3 = new TeamMemberVO("이소영","새또","마라탕");
        TeamMemberVO team4 = new TeamMemberVO("한승현","루피","고기");

        ArrayList<TeamMemberVO> teamList = new ArrayList<>();

        teamList.add(team1);
        teamList.add(team2);
        teamList.add(team3);
        teamList.add(team4);


        TeamDTO team = new TeamDTO();
        team.setTeamName("글써조");
        team.setTeamMember(teamList);

        return team;
    }

}
