# Code Review
Overall
- You haven't pulled up any abstraction between User/Computer (eg. a Player interface). Can you explain why? 
- The game result is an integer returned from a method called compare. I found this a bit confusing as it is very similar to implementing Comparable, but not quite, and Comparable for me is more about sorting. I also think the magic numbers of 0 - Tie, 1 - Win, 2 - Lose could cause confusion down the line. Can you think of a way to make this more readable?

RockPaperScissors
- Test is empty, I'd be curious to see how you'd test this class.

Computer

- Test doesn’t really test anything, the compiler already ensures a shape is returned. Can you think of a refactoring that would make this class more testable?



User

- What about bad input? Would be good to have a test for that edge case.

- Why use System.setIn and not just pass the input stream into the constructor?