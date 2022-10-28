This repository contains all materials and other things of interest from weekly tutorial.

# Usage

This repository depends on:
- [Python](https://www.python.org/)
- [Pandoc](https://github.com/jgm/pandoc)
- Latex, e.g., pdflatex
- [metropolis Latex beamer theme](https://github.com/matze/mtheme)
- [Just](https://github.com/casey/just)

To build the PDF for a specific tutorial use

```text
$ just build tutorial1
```

where `tutorial1` is the name of the markdown file within the `slides` folder.

To build all PDFs for all tutorials use

```text
$ just build-all
```

The resulting PDFs will be stored within the `slides` folder.