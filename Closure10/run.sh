class=com.google.javascript.jscomp.NodeUtil
project_cp="/home/edinella/projects/d4j-projects/Closure-10b/build/classes:/home/edinella/projects/d4j-projects/Closure-10b/lib/args4j.jar:/home/edinella/projects/d4j-projects/Closure-10b/lib/guava.jar:/home/edinella/projects/d4j-projects/Closure-10b/lib/json.jar:/home/edinella/projects/d4j-projects/Closure-10b/lib/jsr305.jar:/home/edinella/projects/d4j-projects/Closure-10b/lib/protobuf-java.jar:/home/edinella/projects/d4j-projects/Closure-10b/build/lib/rhino.jar:/home/edinella/projects/d4j-projects/Closure-10b/lib/ant.jar"
D4J_SEED=42
budget=10
DIR_OUTPUT=out-closure10/
#DIR_OUTPUT=out/

java -cp evosuite-seed.jar shaded.org.evosuite.EvoSuite  \
    -class $class \
    -projectCP $project_cp \
    -seed $D4J_SEED \
    -Dsearch_budget=$budget \
    -Dtest_dir=$DIR_OUTPUT \
    -Dshow_progress=false \
    -Dfilter_assertions=false \
    -Dtest_comments=false \
    -Dselected_junit="com.google.javascript.jscomp.Seed" \
    -mem 1500 \


#-Dtest_factory="junit" \
#-Dlog.level=DEBUG \
#-Dtest_carving=true \
