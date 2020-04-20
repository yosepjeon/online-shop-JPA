package jpabook.jpashop;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
	
	
	@PersistenceContext // 해당 어노테이션이 있으면 스프링 부트가 Entity Manager를 알아서 주입해줌
	private EntityManager em;
	
	public Long save(Member member) {
		em.persist(member);
		
		return member.getId();
	}
	
	public Member find(Long id) {
		return em.find(Member.class, id);
	}
}
