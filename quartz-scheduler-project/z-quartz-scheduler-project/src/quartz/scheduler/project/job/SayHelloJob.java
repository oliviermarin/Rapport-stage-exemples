package quartz.scheduler.project.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SayHelloJob implements Job{

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		System.out.println( "Hello, world !" );
		
	}

}
