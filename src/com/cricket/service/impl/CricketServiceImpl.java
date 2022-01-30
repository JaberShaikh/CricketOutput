package com.cricket.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cricket.dao.CricketDao;
import com.cricket.model.Ground;
import com.cricket.model.Player;
import com.cricket.model.Team;
import com.cricket.service.CricketService;

@Service("cricketService")
@Transactional
public class CricketServiceImpl implements CricketService {

 @Autowired
 private CricketDao cricketDao;
 
@Override
public Player getPlayer(String whatToProcess, String valueToProcess) {
	return cricketDao.getPlayer(whatToProcess, valueToProcess);
}

@Override
public Team getTeam(String whatToProcess, String valueToProcess) {
	return cricketDao.getTeam(whatToProcess, valueToProcess);
}

@Override
public List<Team> getTeams() {
	return cricketDao.getTeams();
}

@Override
public List<Player> getPlayers(String whatToProcess, String valueToProcess) {
	return cricketDao.getPlayers(whatToProcess, valueToProcess);
}

@Override
public List<Ground> getGrounds() {
	return cricketDao.getGrounds();
}

@Override
public Player getPlayer(String whatToProcess, Player player) throws IllegalAccessException, InvocationTargetException {
	return cricketDao.getPlayer(whatToProcess, player);
}

@Override
public Ground getGround(int ground_id) {
	return cricketDao.getGround(ground_id);
}

}