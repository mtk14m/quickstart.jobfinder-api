package fr.quickstart.jobsfinder.Job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class JobController {

    private List<Job> jobs = new ArrayList<Job>();

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobs;
    }

}
