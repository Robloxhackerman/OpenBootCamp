package nicol.spring.openbootcampspring;

import org.springframework.stereotype.Component;

@Component
public class UserService {

	NotificationService notificationService;
	

    public UserService(NotificationService notificationService) {
		super();
		this.notificationService = notificationService;
	}
    
    
}
