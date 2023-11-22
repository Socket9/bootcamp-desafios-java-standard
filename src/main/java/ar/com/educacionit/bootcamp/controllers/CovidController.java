package ar.com.educacionit.bootcamp.controllers;

import java.io.IOException;
import java.util.List;

import ar.com.educacionit.bootcamp.connectors.CovidAPIConnector;
import ar.com.educacionit.bootcamp.entities.CovidDate;
import ar.com.educacionit.bootcamp.entities.CovidDateDto;
import ar.com.educacionit.bootcamp.services.CovidService;
import ar.com.educacionit.bootcamp.services.CovidServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/covid")
public class CovidController extends HttpServlet {

	private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
		CovidService service = new CovidServiceImpl("https://api.covidtracking.com/v1/us/");
		List<CovidDateDto> covidStatList =  (List<CovidDateDto>) service.getCovidStatsFromDB();
		
		if(covidStatList.size() != 0) {
			resp.getWriter().print(covidStatList);
		} else {
			covidStatList = (List<CovidDateDto>) service.getCovidStatsFromAPI();
			service.saveList(covidStatList);
			resp.getWriter().print(covidStatList);
		}
   
    }
    
}
