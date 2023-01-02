package com.cloudtechmasters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class CourseController {
    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);
//create two endpoints getAllSeasonCricketscores and get2023Matches
    @GetMapping("/")
    public List<String> getAllSeasonCricketscores(){
        logger.info("added for failing sonar build");
        return Arrays.asList("All seasons cricket scores and commentary: 2021-2023");
    }

    @GetMapping("/2023")
    public List<String> get2023Matches(){
        return Arrays.asList("Cricket Match Archives: 2023", "No matches found for this year");
    }

}
