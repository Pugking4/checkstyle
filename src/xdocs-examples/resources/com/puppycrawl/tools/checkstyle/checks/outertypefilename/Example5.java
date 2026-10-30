/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="OuterTypeFilename"/>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.checks.outertypefilename;

// xdoc section - start
class Example5Helper {} // violation 'The name of the outer type and the file do not match.'
class Example5 {}
// xdoc section - end
