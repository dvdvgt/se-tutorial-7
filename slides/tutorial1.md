---
title: "Software Engineering: Tutorial 1"
author: "David Voigt"
theme: metropolis
date: "October 28th, 2022"
fonttheme: "metropolis"
urlcolor: blue
linkstyle: bold
linkcolor: blue
lang: en-GB
---

# Organisational matters

## General information

- The tutorial starts at c.t., that is, at 12:15 o'clock
- Attendance is not mandatory
- Please bring your laptop if possible
- Relevant material presented during the tutorial will be uploaded to [Github](https://github.com/dvdvgt/se-tutorial-7)

## Format of the tutorial

- Discuss common mistakes in your assignments
- Provide additional useful knowledge with respect to the lecture, e.g., basic terminal usage
- Prepare you for your assignments
- Answer your questions regarding the assignments
  - For general questions regarding the lecture, please ask directly in the forum


# Basic terminal usage

1. Who of you has previous experience working with the command line?
2. Who is regularly using the command line during their normal workflow?

# Basic terminal usage: useful commands

| command | usage |
|---------|-------|
| `ls` | show files in current directory |
| `cd [DIR]` | changes the current working directory |
| `pwd` | prints the current working directory |
| `mv [FILE]* [FILE]` | moves one or more file(s) to another directory |
| `cp [FILE]* [File]` | copies one or more file(s) to another directory |

# Basic terminal usage: useful commands

| command | usage |
|---|---|
| `touch [FILE]` | creates a new file |
| `cat [FILE]` | outputs the content of a given file |
| `path/to/executable` | executes an executable |
| `[CMD1] | [CMD1]` | redirects the output of `CMD1` to `CMD2` as input |
| `[CMD] > out.txt` | writes the output of `CMD` to the file `out.txt` |
| `[CMD] >> out.txt` | appends the output of `CMD` to the file `out.txt` |
| `man CMD` | shows the manuel/documentation for a given command |

# Basic terminal usage

**Are there any questions?**

# git recap

::: columns

::: {.column width=30%}
- `git` is the de-facto standard VCS
- snapshot based
- dezentral
:::

::: {.column width=70%}
![](gfx/working-stage-repo.png)
:::

:::

# git recap

## working copy

The **working copy** the project folder that is currently under git version control. The working copy consists of "normal" files outside the `.git` that can be altered.

## staging area

The **staging area** is like a drafting area. It is also called **index** and contains snapshots of files to be commited.

## repository

The **repository** is represented by the `.git` folder. The repository **contains the whole history** of the project, e.g., commits and file snapshots.

# Basic git usage: common commands



# Basic git usage: useful links

- git visualizer: \url{https://git-school.github.io/visualizing-git/}
- git branching tutorial: \url{https://learngitbranching.js.org/}
- git cheat sheet: \url{https://training.github.com/downloads/github-git-cheat-sheet.pdf}