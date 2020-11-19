package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Map;
import com.eomcs.pms.service.ProjectService;
import com.eomcs.util.Prompt;

public class ProjectSearchCommand implements Command {

  ProjectService projectService;

  public ProjectSearchCommand (ProjectService projectService) {
    this.projectService = projectService;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in, Map<String, Object> context) {
    System.out.println("[프로젝트 검색]");

    try {
      String keyword = Prompt.inputString("검색어? ", out, in);


    }
  }
}
