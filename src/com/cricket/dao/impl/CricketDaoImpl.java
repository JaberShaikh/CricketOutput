package com.cricket.dao.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cricket.dao.CricketDao;
import com.cricket.model.Ground;
import com.cricket.model.Player;
import com.cricket.model.Team;
import com.cricket.util.CricketUtil;

@Transactional
@Repository("cricketDao")
@SuppressWarnings("unchecked")
public class CricketDaoImpl implements CricketDao {

 @Autowired
 private SessionFactory sessionFactory;
 
@Override
public Player getPlayer(String whatToProcess, String valueToProcess) {
	switch (whatToProcess) {
	case CricketUtil.PLAYER:
		return (Player) sessionFactory.getCurrentSession().createQuery("from Player WHERE PlayerId=" + valueToProcess).uniqueResult();  
	default:
		return null;  
	}
}

@Override
public Team getTeam(String whatToProcess, String valueToProcess) {
	switch (whatToProcess) {
	case CricketUtil.TEAM:
		return (Team) sessionFactory.getCurrentSession().createQuery("from Team WHERE TeamId=" + valueToProcess).uniqueResult();  
	default:
		return null;  
	}
}

@Override
public List<Team> getTeams() {
	return sessionFactory.getCurrentSession().createQuery("from Team").list();
}

@Override
public List<Player> getPlayers(String whatToProcess, String valueToProcess) {
	switch (whatToProcess) {
	case CricketUtil.TEAM:
		return sessionFactory.getCurrentSession().createQuery("from Player WHERE TeamId=" + valueToProcess).list();  
	default:
		return null;  
	}
}

@Override
public Player getPlayer(String whatToProcess, Player player) throws IllegalAccessException, InvocationTargetException {
	return (Player) sessionFactory.getCurrentSession().createQuery("from Player WHERE PlayerId=" + player.getPlayerId()).uniqueResult();
}

@Override
public List<Ground> getGrounds() {
	return sessionFactory.getCurrentSession().createQuery("from Ground").list();  
}

@Override
public Ground getGround(int ground_id) {
	return (Ground) sessionFactory.getCurrentSession().createQuery("from Ground WHERE GroundId=" + ground_id).uniqueResult();  
}

}