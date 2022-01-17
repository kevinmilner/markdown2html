# markdown2html
Simple app for converting Markdown to HTML. The resulting HTML will have a stylesheet that looks like GitHub flavored Markdown.

This simply wraps Markdown tools available in [OpenSHA](https://github.com/opensha/opensha), which in turn uses and extends [Commonmark](https://github.com/commonmark/commonmark-java).

Don't bother cloning this (you'll have to also clone OpenSHA in the same parent directory and there's really not much here), just downlaod a jar file from the releases page. Then run with:

```
java -jar markdown2html.jar
```
