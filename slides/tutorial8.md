---
title: "Software Engineering: Tutorial 8"
author: "David Voigt"
theme: metropolis
date: "December 16th, 2022"
fonttheme: "metropolis"
fontsize: 12pt
urlcolor: blue
linkstyle: bold
linkcolor: black
lang: en-GB
---


## Common Mistakes: 1

\footnotesize
``` {.scala .numberLines}
def getAnswer(bigPack: Pack, smallPack: Pack): ProblemAnswer = {
    var result = ProblemAnswer.Small
    if (bigPack.pricePerLiter() <= smallPack.pricePerLiter()) {
        result = ProblemAnswer.Large
    }
    return result
}
```

## Common Mistakes: 1

\footnotesize
``` {.scala .numberLines}
def getAnswer(bigPack: Pack, smallPack: Pack): ProblemAnswer =
    if (bigPack.pricePerLiter() <= smallPack.pricePerLiter())
        ProblemAnswer.Large
    else
        ProblemAnswer.Small
```

## Common Mistakes: 2

\footnotesize
``` {.scala .numberLines}
try {
    throw Exception("The input has the wrong format")
} catch {
    case e: Exception => println("The input format is invalid")
}
```
\normalsize

. . .

- Either the current state is really **exceptional** and we terminate the current computation or the computation may continue and we just print a warning
- Here the computation is not terminated and the exception is just used for immediately printing something to the screen
- Use exceptions if something **exceptional** occurs to prematurely exit a computation with a descriptive error message

## Common Mistakes: 3

\footnotesize
``` {.scala}
if c then true
else false
```

. . .

\normalsize
but this is just

\footnotesize
``` {.scala}
c
```

## Revision: Interfaces

### What is an interface?

. . .

![Brachthäuser, J. (2022). "Interface visualization". Slides Software Engineering (WS22)](gfx/interface.png)

- **API**: **A**pplication **P**rogramming **I**nterface describes how two services communicate
- Hides the actual implementation from the user

Do you know a good example for an interface?

## Design by Contract

### Precondition

- Guarantees for the **input** as requirement for the user
- To be keept as weak as possible for maximum reuse

### Postcondition

- Guarantees for the **output** as requirement for the implementor
- To be keept as strong as possible
- Tradeoff reusability with maintainability

### Invariants

- Aspects left unchanged by usage


## Design by Contract: Example

``` {.scala}
def head[T](xs: List[T]): T
```

Preconditions, Postconditions, Invariants?

. . .

### Preconditions

- The list is non-empty

### Postconditions

- The return value is the first element in the list
  
### Invariants

- The given list is unchanged