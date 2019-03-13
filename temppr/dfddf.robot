***settings***
Resource    variables/samplevar.robot
***Test cases***

test case1
    print hello
    print hello1
*** Keywords ***
print hello1
    Log To Console    ${something}    

 
    
print hello
    Log To Console    helloworld
    Log To Console    added directly to git 
    
      
