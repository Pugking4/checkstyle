/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="OuterTypeFilename"/>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.checks.outertypefilename;

// xdoc section - start
enum Example4 {}
class Example4Helper {} // ok, only the first outer type is checked
// xdoc section - end
