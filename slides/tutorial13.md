---
title: "Software Engineering: Tutorial 13"
author: "David Voigt"
theme: metropolis
date: "February 3rd, 2023"
fonttheme: "metropolis"
urlcolor: blue
linkstyle: bold
linkcolor: black
lang: en-GB
---

## Agenda

1. What's *Fuzzing*?
   1. Motivation: [Heartbleed](https://en.wikipedia.org/wiki/Heartbleed)
   2. Recap
2. Exercises

# Fuzzing

## Heartbleed

:::::: {.columns}
::: {.column width="70%"}
- Critical security bug (buffer over-read) in the OpenSSL cryptography library (2012 - 2014) [^1]
- Used in the TLS protocol (most prominently used in the HTTPS protocol)
- Even though many cryptography and other security experts audited the *open source* code, the bug remained for *years*
:::
::: {.column width="30%"}
![Source: [Wikipedia](https://en.wikipedia.org/wiki/Heartbleed)](https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/Heartbleed.svg/360px-Heartbleed.svg.png)
:::
::::::

[^1]: Relevant [xkdc](https://imgs.xkcd.com/comics/heartbleed_explanation_2x.png)

---

![Source: [https://en.wikipedia.org/wiki/Heartbleed](https://en.wikipedia.org/wiki/Heartbleed)](https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Simplified_Heartbleed_explanation.svg/500px-Simplified_Heartbleed_explanation.svg.png)

---

### Consequences

- A malicious attacker could in theory retrieve up to $64$ kB of information from the servers memory
  - e.g. passwords, session cookies (for impersonation), private keys, ...
- While the bug was fixed the same day it was publicised, it is unkown if this bug was exploited previously
- Even publicly available (open source), audited and high-profile libraries are not immune to bugs

### Conclusion

We need to ~~expect~~ test the unexpected! 

$\Rightarrow$ Use *fuzzing* for generating random, unexpected and/or malformed data as input for software as tests

## Recap: Fuzzing

- (Coverage-guided) *fuzzing* **automatically** generates unexpected, malformed and/or random data
- This data is provided as input for program under test
- The program's behavior is monitored for crashes or other *undefined behavior*
- **Goal**: Validate that a program is robust against all kinds of different input and does not reveal *undefined behavior*

# Exercises

---

Now it is **your** turn to write a fuzzer!

<https://github.com/se-tuebingen-exercises/tut7-exercise13>