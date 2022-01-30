package com.cricket.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import com.cricket.model.Ground;
import com.cricket.model.Player;
import com.cricket.model.Team;

public interface CricketService {
  Player getPlayer(String whatToProcess, String valueToProcess);
  Player getPlayer(String whatToProcess, Player player) throws IllegalAccessException, InvocationTargetException;
  Team getTeam(String whatToProcess, String valueToProcess);
  Ground getGround(int ground_id);
  List<Player> getPlayers(String whatToProcess, String valueToProcess);
  List<Team> getTeams();
  List<Ground> getGrounds();
}