package quartz.scheduler.project.service;

import quartz.scheduler.project.job.SayHelloJob;

public class MainService {
	
	public static void main(String[] args) {
		
		String cron = "0 0/1 * * * ?";
		
		JobShedulerService.scheduleJob( SayHelloJob.class , cron );
		
	}
	
}
