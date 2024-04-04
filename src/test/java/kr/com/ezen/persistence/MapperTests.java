package kr.com.ezen.persistence;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.com.ezen.dto.MemberVO;
import kr.com.ezen.mapper.MemberMapper;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MapperTests {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Test
	public void testGetTime() {
		log.info("----------------------");
		log.info(memberMapper.getClass().getName());
		log.info(memberMapper.getTime());
		log.info("----------------------");
	}
//	@Test
//	public void testInsert() {
//		
//		for(int i=0; i<10; i++) {
//			MemberVO vo = MemberVO.builder()
//					.id(i)
//					.name("user"+i)
//					.phone("010-1111-1111" +i)
//					.address("수원시 장안구" +i)
//					.build();
//			memberMapper.insertMember(vo);
//		}	
//	}
	
//	@Test
//	public void testUpdate() {
//		MemberVO vo = MemberVO.builder()
//				.id(1)
//				.name("조조")
//				.phone("111-1111-1111")
//				.address("정자동")
//				.build();
//		memberMapper.updateMember(vo);
//	}
//	@Test
//	public void testDelete() {
//		
//		memberMapper.deleteMember(9);
//	}
//	
//	@Test
//	public void testselectOne() {
//		MemberVO vo = memberMapper.selectOneMember(3);
//		
//		log.info(vo);
//		
//	}
	@Test
	public void testselectAll() {
		List<MemberVO> list = memberMapper.selectAll();
		
		for(MemberVO vo : list)
			log.info(list);
		
//		memberMapper.selectAll().forEach(vo-> log.info(vo));
		
	}
}
