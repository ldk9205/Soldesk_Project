package dev.boot.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.boot.backend.service.MemberService;
import dev.boot.backend.vo.MemberVO;

@Controller
public class APIcontroller {

    @Autowired
    MemberService memberService;

    @GetMapping("/members")
    public @ResponseBody List<MemberVO> selectListMembers() {
        List<MemberVO> allMembers = memberService.selectAllMembers();
        return allMembers;
    }
}