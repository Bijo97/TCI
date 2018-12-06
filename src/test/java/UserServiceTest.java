import UserService.SecurityService;
import UserService.User;
import UserService.UserDAO;
import UserService.UserServiceImpl;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    public void userGetNewCorrectPasswordAndBackendIsUpdated() throws Exception {
        //ARRANGE
        //Mock User
        User mockedUser = mock(User.class);
        when(mockedUser.getPassword()).thenReturn("password");

        //Mock SecurityService
        SecurityService mockedSecurityService = mock(SecurityService.class);
        when(mockedSecurityService.md5(mockedUser.getPassword())).thenReturn("passwordMd5");

        //Mock UserDAO
        UserDAO mockedUserDAO = mock(UserDAO.class);

        UserServiceImpl sut = new UserServiceImpl(mockedUserDAO, mockedSecurityService);

        //ACT
        sut.assignPassword(mockedUser);

        //ASSERT
        verify(mockedUserDAO).updateUser(mockedUser);
    }
}
