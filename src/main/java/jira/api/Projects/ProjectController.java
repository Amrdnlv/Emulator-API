package jira.api.Projects;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.List;
import java.util.StringJoiner;

@RestController
@RequestMapping("/rest/api/2/")
@ResponseStatus

public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }


    @GetMapping(path = "all")
    public List<Project> List(){
        return projectService.get();
    }


    @PostMapping(path = "issue")
    public String add(@RequestBody Project project){
        int s =  projectService.add(project);
        return projectService.masproject.get(s).toString();
    }


    @DeleteMapping(path = "issue/{projectId}")
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public String Delete(@PathVariable("projectId") int projectId){
        boolean flag = projectService.delete(projectId);
        if (flag == true)return "the project has been deleted";else{
            return "the project does not exist";
        }
    }

    @PutMapping(path = "issue/update/{projectId}")
    public String Update(@PathVariable("projectId") int projectId, @RequestBody Project project) {
        int index = projectService.update(project, projectId);
        if (index != -1)return projectService.masproject.get(index).toString(); else return "the project does not exist";
    }
}
