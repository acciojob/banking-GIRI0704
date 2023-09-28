package com.driver;

public class CurrentAccount extends BankAccount {

    private String tradeLicenseId; // Consists of Uppercase English characters only

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        super(name, balance, 5000); // Minimum balance is 5000 by default
        this.tradeLicenseId = tradeLicenseId;
        validateLicenseId();
    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are the same.
        // If the license Id is valid, do nothing.
        // If the characters of the license Id cannot be rearranged to create any valid license Id,
        // throw "Valid License cannot be generated" Exception

        for (int i = 0; i < tradeLicenseId.length() - 1; i++) {
            if (tradeLicenseId.charAt(i) == tradeLicenseId.charAt(i + 1)) {
                // If consecutive characters are the same, rearrange them to create a valid license Id
                char[] chars = tradeLicenseId.toCharArray();
                for (int j = 0; j < chars.length - 1; j += 2) {
                    if (j + 1 < chars.length) {
                        char temp = chars[j];
                        chars[j] = chars[j + 1];
                        chars[j + 1] = temp;
                    }
                }
                tradeLicenseId = new String(chars);
                return; // Validated and rearranged successfully
            }
        }

        // If it reaches here, it means the license Id is valid
    }
}
