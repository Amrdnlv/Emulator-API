package jira.api.Projects;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    static int index;
    public List <Project> masproject = new ArrayList<Project>();

    public List<Project> get(){
        return masproject;
    }
    public int add(Project project) {
        masproject.add(new Project(project.getSummary(), project.getAtl_token(), project.getPriority(), project.getUser()));
        index = masproject.size()-1;
        return index;
    }

    public boolean delete(int projectId){
        for(int i =0; i<masproject.size(); i++) {
            int prid =  masproject.get(i).getId();
            if(prid == projectId){ masproject.remove(i);return true;} }
        return false;
    }
    public int update (Project project, int projective)
    {
        for(int i =0; i < masproject.size(); i++) {
            int pridd = masproject.get(i).getId();
                if(pridd == projective)
                {
                    masproject.get(i).setSummary(project.getSummary());
                    masproject.get(i).setAtl_token(project.getAtl_token());
                    masproject.get(i).setPriority(project.getPriority());
                    masproject.get(i).setUser(project.getUser());
                    return i;
                }
        }
        return -1;
    }
}
