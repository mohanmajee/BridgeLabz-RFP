package day20;

public class UserRegistrationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRegistrationUseCases obj = new UserRegistrationUseCases();
        obj.ValidateFirstName();
        obj.ValidateLastName();
        obj.ValidateEmail();
        obj.ValidateMobileNoFormat();
        obj.PasswordRuleMinimum8Character();
        obj.PasswordRuleAtleastOneUpperCase();
        obj.PasswordRuleAtleastOneNumericValue();
        obj.PasswordRuleExactlyOneSpecialCharacter();
        obj.ClearAllEmailSample();

	}

}
