package com.github.janwe.scaladi
import com.codahale.jerkson.Json._

class TestUserRepository extends UserRepository {
  def getUsers = {
    List(User("test1", "Test 1"), User("test2", "Test 2"), User("test3", "Test 3"))
  }
}