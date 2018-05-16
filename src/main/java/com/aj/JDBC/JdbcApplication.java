package com.aj.JDBC;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@SpringBootApplication
@RestController
public class JdbcApplication {

	@Autowired
	IAnswerRepo answerRepo;

	@Autowired
	IQuestionRepo questionRepo;

//	Question question;

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

	@RequestMapping(value = "/q", method = RequestMethod.GET)
	public @ResponseBody Object home() {
		return questionRepo.findAll();
	}

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	public @ResponseBody Object a() {

		return answerRepo.findAll();
	}

	@RequestMapping(value = "/p", method = RequestMethod.GET)
	public @ResponseBody Object p() {

		populate();
		return "populated";
	}

	void populate(){

		Answer answer1 = new Answer("answer 1",false);
		Answer answer2 = new Answer("answer 2",false);
		Answer answer3 = new Answer("answer 3",true);
		Answer answer4 = new Answer("answer 4",false);

		List<Answer> answers = new ArrayList<>();
		answers.addAll(Arrays.asList(answer1,answer2,answer3,answer4));

		Question question = new Question("question 1",answers,answer3);

		answerRepo.save(answer1);
		answerRepo.save(answer2);
		answerRepo.save(answer3);
		answerRepo.save(answer4);

		questionRepo.save(question);

	}
}
