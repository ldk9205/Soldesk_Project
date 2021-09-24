package dev.boot.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.boot.backend.dao.MemberDAO;
import dev.boot.backend.vo.MemberVO;

@Service
public class MemberService {

    @Autowired
    MemberDAO memberDao;

    public List<MemberVO> selectAllMembers() {
        return memberDao.selectAllMembers();
    }
}
