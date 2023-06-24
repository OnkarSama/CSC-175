<p1>
    <h2 align="center"> Making and ATM Using Test Driven Development and Abstract Data Types </h2>
    <h2></h2>
</p1>

<h4>The way this project is ran is by having a main class of [ATM.java](ATM.java). That uses other classes such as: </h4>

<h4 align="center">[Bank2.java](Bank2.java) <br> [Bank.java](Bank.java) <br> [Account.java](Account.java) <br> [Checking.java](Checking.java) <br> [Money.java](Money.java) <br> </h4>

 <h4>With this class it takes its account information from the [BankAccounts.txt](BankAccounts.txt) using the [InputManager](InputManager.java). To add accounts to a Bank all while checking if it is a Checkings account or a Regular account. </h4>

<h4>If it is a Checking account it will have an Overdraft Amount of $50.00. Meaning the user is allowed to withdraw $50 dollars over the account balance.</h4>

<h4>The [ATM Class](ATM.java) then uses the [IOHandlerDialog](IOHandlerDialog.java) to create a window on the user screen to ask for a user's bank account number. If the user inputs a wrong account number it will repeat until a valid id number is inputted. If the user wants to quit at this stage they simply enter "quit".</h4>

<h4>Then there is a simple do while loop to ask the user for what transaction they will like to do.</h4>

```java
do {
    
    String userTransaction = readUserTransaction(ioh);

    transactionType = executeTransaction(myBank,userIDNumber,userTransaction,ioh);

    }while(transactionType != 3);
```
<h4>What this simple do while loop does it call a method that uses the [IOHandlerDialog](IOHandlerDialog.java) to create a dropdown window to select from the following options: </h4>

<h4 align="center"> 1) Check Balance <br> 2) Deposit <br> 3) Withdraw <br> 4) Exit <br></h4>

<h4>All of these methods have failsafe in place. They all throw the correct errors and if an error is throw it is handled correctly by re-asking for input. <br> </h4>

<h4>Finally ending it with outputting the updated accounts into a new text file [UpdatedAccount.txt](/Users/onkar/Documents/CSC175/LAB17/UpdatedAccount.txt)</h4>



