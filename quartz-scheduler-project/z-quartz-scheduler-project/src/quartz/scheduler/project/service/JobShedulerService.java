package quartz.scheduler.project.service;

import static org.quartz.JobBuilder.newJob;
import org.quartz.CronScheduleBuilder;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;

public class JobShedulerService {
	
	public static Integer scheduleJob( Class< ? extends Job > jobClass, String cron ) {

		// -------------------------
		// Declaration of the solman job
		// -------------------------
			    
		JobKey jobKey = new JobKey( jobClass.getName() + "Job", "group1" );
			    
		JobDetail jobDetail = newJob( jobClass )
			    		
			    				.withIdentity( jobKey )
			    				
			    				.build();
		
	    // -------------------------
	 	// Declaration of the Solman Trigger
	 	// -------------------------
		
		TriggerKey triggerKey = new TriggerKey( jobClass.getName() + "Trigger", "group1" );
	    
	    Trigger trigger = TriggerBuilder
	    		
	    						.newTrigger()
	    						
	    						.withIdentity( triggerKey )
	    						
	    						.withSchedule( CronScheduleBuilder.cronSchedule( cron ) )
	    								
	    						.build();
	    
	    // -------------------------
	    // Lauching the job
	    // -------------------------
	 	    
	    Scheduler scheduler;
	    
	    try {
	 				
	    	scheduler = new StdSchedulerFactory().getScheduler();
	 		    	
	    	scheduler.scheduleJob( jobDetail, trigger );
	 		    
	    	scheduler.start();
	 				
	    } catch (SchedulerException e) {
	 				
	    	e.printStackTrace();
	 				
	    }
	    
		return 1;
	    
	}
	
}
