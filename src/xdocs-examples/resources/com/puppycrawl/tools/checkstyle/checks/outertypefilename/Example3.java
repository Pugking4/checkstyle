/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="OuterTypeFilename"/>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.checks.outertypefilename;

// xdoc section - start
interface Example3Helper {} // ok, file has a public outer type
public class Example3 {}
// xdoc section - end
