# 2 + 2 = 5 ?
Here I am trying to output 5 when we add 2 with 2 programmatically


### Output
![Screenshot](screenshot.PNG)


### Explanation
We are using Java's abality of doing [Reflection](https://www.baeldung.com/java-reflection) 
```javascript
Class cache = Integer.class.getDeclaredClasses()[0];
```
