package dev.boot.backend.dao;

import dev.boot.backend.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDAO {
    public List<MemberVO> selectAllMembers();
}
