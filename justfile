alias b := build
alias b-all := build-all

default:
    echo 'Hello, world!'

build TUTORIAL:
	pandoc slides/{{TUTORIAL}}.md -t beamer -o slides/{{TUTORIAL}}.pdf --include-in-header=style.tex --slide-level=2

build-all:
    #!/usr/bin/env python3
    import os
    import subprocess
    path = "slides/"
    for file in os.listdir(path):
        if ".md" in file:
            subprocess.run(["just", "build", file.removesuffix(".md")])

