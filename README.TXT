------------------------------------------------------------------------
App for learning foreign vocabulary
------------------------------------------------------------------------



4 classes

class Menu
- user interface to navigate the app

class Query
- query and sorting of the vocabulary
- user can choose in class Menu whether query should display the german or the foreign vocabulary, user input/answer then must be in the opposite language
- checking correctness of user input in query 
- after each query the vocabulary must be sorted depending on the correct answer of the user (correct input)

- Sorting of vocabulary
  4 types of vocabulary (represented by corresponding enum values)
  - daily -> corresponds to newly added vocabulary or vocabulary that was not remembered correctly during query (incorrect user input)
  - weekly -> contains the daily vocabulary that was remembered correctly
  - monthly -> contains the weekly vocabulary that was remembered correctly
  - randomly -> contains the monthly vocabulary that was remembered correctly
  if vocabulary is remembered correctly it ascends to the next stage
  if vocabulary is not remembered correctly it descends to daily -> regardless of current type

class Vocabulary
- creating vocabulary pairs with key and value
- key = foreign vocabulary
- value = german translation



